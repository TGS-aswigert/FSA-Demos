import "./styles.css";
import Navbar from "./Components_end/Navbar";
import LandingPage from "./Components_end/LandingPage";
import Contact from "./Components_end/Contact";
import AboutUs from "./Components_end/AboutUs";

import { BrowserRouter, Route, Routes } from 'react-router-dom';

export default function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path='/' exact element={<LandingPage />} />
          <Route path='/about-us' element={<AboutUs />} />
          <Route path='/contact' component={<Contact />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}
