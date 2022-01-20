import "./styles.css";
import Navbar from "./Components/Navbar";
import LandingPage from "./Components/LandingPage";
import Contact from "./Components/Contact";
import AboutUs from "./Components/AboutUs";

export default function App() {
  return (
    <div className="App">
        <Navbar />
        <LandingPage />
        <AboutUs />
        <Contact />
    </div>
  );
}
