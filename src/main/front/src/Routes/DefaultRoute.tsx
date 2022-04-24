import React from "react";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Header from "../components/Header";
import Footer from "../components/Footer";
import Home from '../pages/Home';
import Register from '../pages/Register';


export default function defaultRoute() {
    return (
        <BrowserRouter>
            <Header/>
            <Routes>
                <Route path={'/register'} element={<Register />} />
                <Route path={'/'} element={<Home />} />
            </Routes>
            <Footer/>
        </BrowserRouter>
    );
}