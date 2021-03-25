import React, {useState, useEffect} from 'react'
import Cards from './card'
// import base_url from "./../api/bootapi"
// import axios from "axios"

const GetAllCards = () => {
    
    const[places, setPlaces] = useState([
        {
            "name": "Bahu Fort",
            "state": "Jammu and Kashmir",
            "district": "Jammu",
            "url": "https://jammu.nic.in/tourist-place/bahu-fort-jammu/"
        },
        {
            "name": "Haridwar",
            "state": "Uttarakhand",
            "district": "Haridwar",
            "url": "https://haridwar.nic.in/"
        },
        {
            "name": "Shri Amarnath Cave Temple",
            "state": "Jammu and Kashmir",
            "district": "Pahalgam",
            "url": "http://www.shriamarnathjishrine.com/"
        },
        {
            "name": "Vaishno Mata",
            "state": "Jammu and Kashmir",
            "district": "Jammu",
            "url": "https://www.maavaishnodevi.org/"
        },
    ]);

    // const getAllPlacesFromServer = () => {
    //     axios.get(`${base_url}`).then(
    //         (response) => {
    //             //For Success
    //             // console.log(response.data);
    //             setPlaces(response.data);
    //         },
    //         (error) => {
    //             //For Error
    //             console.log(error);
    //         }
    //     )
    // };

    // useEffect(() => {
    //     getAllPlacesFromServer();
    // }, []);

  return (
      <div>
        {places.length>0
        ? places.map((item) => <Cards key={item.name} place={item} />)
        : "No Places"}
      </div>
  )
}

export default GetAllCards