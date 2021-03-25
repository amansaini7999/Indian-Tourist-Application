import React from 'react'

const mystyle = {
  color: "white",
  backgroundColor: "DodgerBlue",
  padding: "3px",
  fontFamily: "Arial"
};

function header() {
  return (
    <div style={mystyle} className="header">
      <h1>This application will show you all the destination, you never wanted to miss</h1>
    </div>
  )
}

export default header