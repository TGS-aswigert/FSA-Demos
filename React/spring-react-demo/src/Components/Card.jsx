import React from 'react'

export default function Card({data}) {
  return (
    <div className='card'>
      <p>{data.id}</p>
      <h1>{data.name}</h1>
    </div>
  )
}
