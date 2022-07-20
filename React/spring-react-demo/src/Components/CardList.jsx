import React, { Fragment, useEffect, useState } from 'react'
import { getPagedData } from '../utils';
import Buttons from './Buttons';
import Card from './Card';
import { useParams } from "react-router-dom";

export default function CardList() {

  const { entity } = useParams();

  const [data, setData] = useState([]);

  useEffect(() => {
    getPagedData(0).then(data => setData(data));
  }, []);

  function toTitleCase(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  }

  return (
    <Fragment>
      <h1>{toTitleCase(entity)}</h1>
      <div className='list'>
        {data.map(data => <Card data={data} key={entity + data.id} />)}
      </div>
      <Buttons setter={setData} />
    </Fragment>
  )
}
