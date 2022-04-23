import GlobalStyle from "./styles/GlobalStyle";
import Theme from "./styles/Theme";
import { ThemeProvider } from "./styles/ThemeComponents";
import React from 'react';
import './App.css';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Home from './pages/Home';
import Header from 'components/Header';
import Footer from 'components/Footer';


function App() {
    return (
        <div className="App">
            <ThemeProvider theme={Theme}>
                <GlobalStyle />
                <BrowserRouter>
                    <Header/>
                    <Routes>
                        <Route path="/index" element={<Home />} />
                    </Routes>
                    <Footer/>
                </BrowserRouter>
            </ThemeProvider>
        </div>
    );
}

export default App;
