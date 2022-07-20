import React, { useEffect, useState } from 'react';
import { getPagedData, getDataCount } from '../utils';

export default function Buttons({ setter, entity }) {

  const [pageCount, setPageCount] = useState(0);
  const [page, setPage] = useState(0);

  useEffect(() => {
    getDataCount(entity).then(data => setPageCount(Math.ceil(data / 5)));
  }, [entity]);

  function getNextPage() {
    if (page < pageCount - 1) {
      goToPage(page + 1);
    }
  }

  function getPrevPage() {
    if (page > 0) {
      goToPage(page - 1);
    }
  }

  function goToPage(pageNum) {
    getPagedData(entity, pageNum).then(data => setter(data));
    setPage(pageNum);
  }

  const buttons = [];

  for (let i = 0; i < pageCount; i++) {
    buttons.push(<button key={"button" + i} onClick={() => goToPage(i)}>{i + 1}</button>)    
  }

  return (
    <div className='buttons'>
      <button onClick={getPrevPage}>Prev</button>
      {buttons}
      <button onClick={getNextPage}>Next</button>
    </div>
  )
}
