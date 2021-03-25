import React from 'react'

function card(props) {

  return (
      <div style={{background:"yellow", padding:20}}>
        <h3>{props.place.name}</h3>
        <h5>{props.place.state}</h5>
        <h5>{props.place.district}</h5>
        <h5><a href={props.place.url} target="_blank">URL</a></h5>
        <hr />
      </div>
  )
}

export default card