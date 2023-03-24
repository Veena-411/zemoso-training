import React from "react";
import "./App.css";
import Card from "../src/components/organisms/card/Index";
import { createTheme, ThemeProvider } from "@mui/material/styles";
function App() {
  const theme = createTheme({
    typography: {
      fontFamily: "Montserrat",
    },
  });
  return (
    <div className="App">
      <ThemeProvider theme={theme}>
        <Card />
      </ThemeProvider>
    </div>
  );
}

export default App;
