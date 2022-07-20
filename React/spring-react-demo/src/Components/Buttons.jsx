import React, { useEffect, useState } from 'react';
import { getPagedStudents, getStudentCount } from '../utils';

export default function Buttons({ setter }) {

  const [pageCount, setPageCount] = useState(0);
  const [page, setPage] = useState(0);

  useEffect(() => {
    getStudentCount().then(data => setPageCount(Math.ceil(data / 5)));
  },
    []);

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
    getPagedStudents(pageNum).then(data => setter(data));
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
