import GlobalStyle from "./styles/GlobalStyle";
import Theme from "./styles/Theme";
import { ThemeProvider } from "./styles/ThemeComponents";
import React from 'react';
import './App.css';


function App() {
  return (
    <div className="App">
      <ThemeProvider theme={Theme}>
        <GlobalStyle />
        <header className="App-header">
          <p>
            Edit <code>src/App.tsx</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </ThemeProvider>
    </div>
  );
}

export default App;
