import React from 'react'

function dropdown(props) {

  return (
      <div>
        <button onclick="myFunction()" class="dropbtn">Dropdown</button>
        <div id="myDropdown" class="dropdown-content">
        <a href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
  </div>
      </div>
  )
}

export default dropdown