import React from "react"
import DollThree from "./DollThree"

export default function DollTwo(props) {
  return (
    <div className="doll">
      <h4>Dolly # {props.num}</h4>
      <DollThree num={props.num + 1} tiny={props.tiny} />
    </div>
  )
}
