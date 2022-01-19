import React from "react";
import TinyDoll from "./TinyDoll";

export default function DollThree(props) {
  return (
    <div className="doll">
      <h4>Dolly # {props.num}</h4>
      <TinyDoll num={props.num + 1} tiny={props.tiny} />
    </div>
  )
}
