import React from 'react'

const mystyle = {
  color: "white",
  backgroundColor: "DodgerBlue",
  padding: "3px",
  fontFamily: "Arial"
};

function footer() {
  return (
    <div style={mystyle}>
      <h3>Copyright <a href="https://github.com/amansaini7999" target="_blank">@amansaini7999</a> in 2021</h3>
    </div>
  )
}

export default footer