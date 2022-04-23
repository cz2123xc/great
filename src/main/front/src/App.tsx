import GlobalStyle from "./styles/GlobalStyle";
import Theme from "./styles/Theme";
import { ThemeProvider } from "./styles/ThemeComponents";
import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Home from './pages/Home';


function App() {
  return (
    <div className="App">
      <ThemeProvider theme={Theme}>
        <GlobalStyle />
        <Router>
          <Route path="/" element={<Home />} />
        </Router>
      </ThemeProvider>
    </div>
  );
}

export default App;
