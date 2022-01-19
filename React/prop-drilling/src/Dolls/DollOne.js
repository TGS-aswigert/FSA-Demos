import React from "react"
import DollTwo from "./DollTwo"

export default function DollOne(props) {
  return (
    <div className="doll">
      <h4>Dolly # {props.num}</h4>
      <DollTwo num={props.num + 1} tiny={props.tiny} />
    </div>
  )
}
