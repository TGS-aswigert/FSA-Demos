import React, {useState} from "react"
import "./styles.css"
import DollOne from "./Dolls/DollOne"

export default function App() {
  const [dollNum] = useState(1)
  const [tiny] = useState("I am the tiniest doll of the bunch")

  return (
    <div className="App">
      <DollOne num={dollNum} tiny={tiny} />
    </div>
  )
}
