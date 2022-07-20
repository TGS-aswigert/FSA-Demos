import React, { Fragment, useEffect, useState } from 'react'
import { getPagedStudents } from '../utils';
import Buttons from './Buttons';
import Card from './Card';

export default function StudentsList() {

  const [students, setStudents] = useState([]);

  useEffect(() => {
    getPagedStudents(0).then(data => setStudents(data));
  },
    []);

  return (
    <Fragment>
      <div className='list'>
        {students.map(student => <Card data={student} key={student.id} />)}
      </div>
      <Buttons setter={setStudents} />
    </Fragment>
  )
}
