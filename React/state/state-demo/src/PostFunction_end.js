import React, { useState } from 'react'

export default function PostFunction() {

  let womanProfileImg = "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80";
  
  let parrotProfileImg = "https://images.unsplash.com/photo-1474447976065-67d23accb1e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60";

  const [user, setUser] = useState({
    name: "Jesse",
    profile_image: womanProfileImg,
    text: "This is some text in a post"
  })

  function nextPost() {
    setUser({
      name: "Parrot",
      profile_image: parrotProfileImg,
      text: "SQUAWK!"
    })
  }

  return (
    <div>

      <div className='post'>
        <img className='profile-img' src={user.profile_image} alt='profile image' />

        <div className='post-text'>
          <h3>{user.name}</h3>
          <p>{user.text}</p>
        </div>
      </div>

      <button onClick={nextPost}>Next Post</button>

    </div>
  )
}
