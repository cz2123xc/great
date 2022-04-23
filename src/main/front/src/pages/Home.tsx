import React from "react";
import {Link} from "react-router-dom";

export default function Home() {
  return (
    <div className="container">
      <h1>Hello Next.js</h1>
      <p>
        <Link to="/about">About</Link>
      </p>
    </div>
  );
}