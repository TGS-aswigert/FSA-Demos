import { useState } from "react";
import "./styles.css";

function App() {

  const [isDarkTheme, setIsDarkTheme] = useState(false);

  return (
    <div className={isDarkTheme ? "App dark-mode" : " App light-mode"}>

      <div className="container">

        <h1>{isDarkTheme ? "Dark Theme" : "Light Theme"}</h1>

        <button type="button" onClick={() => setIsDarkTheme(!isDarkTheme)}>
          Toggle Theme
        </button>

      </div>

    </div>
  );
}

export default App;
