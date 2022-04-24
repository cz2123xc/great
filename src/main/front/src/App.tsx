import GlobalStyle from "./styles/GlobalStyle";
import Theme from "./styles/Theme";
import { ThemeProvider } from "./styles/ThemeComponents";
import React from 'react';
import './App.css';
import {BrowserRouter, Routes} from 'react-router-dom';
import DefaultRoute from './Routes/DefaultRoute';
import Header from 'components/Header';
import Footer from 'components/Footer';


function App() {
    return (
        <div className="App">
            <ThemeProvider theme={Theme}>
                <GlobalStyle />
                <DefaultRoute />
            </ThemeProvider>
        </div>
    );
}

export default App;
