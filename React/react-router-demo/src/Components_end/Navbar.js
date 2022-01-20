import React from "react";
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <header>
      <h2>WebSite</h2>
      <nav>
        <Link to="/" className="navLink">
          Homepage
        </Link>
        <Link to="/about-us" className="navLink">
          About Us
        </Link>
        <Link to="/contact" className="navLink">
          Contact
        </Link>
      </nav>
    </header>
  );
}
