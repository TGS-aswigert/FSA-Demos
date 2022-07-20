import React from 'react'

export default function Card({data}) {
  return (
    <div className='card'>
      <h1>{data.id}</h1>
      <h1>{data.name}</h1>
    </div>
  )
}
