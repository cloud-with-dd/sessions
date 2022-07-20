import "react-pro-sidebar/dist/css/styles.css";
import Aside from "./pages/Aside";
import Continents from "./pages/Continents"
import Countries from "./pages/Countries"
import Cities from "./pages/Cities"
import Towns from "./pages/Towns"
import Home from "./pages/Home"

import { Route, Routes } from "react-router-dom"

function App() {

  return (
    <div className="App">
      <Aside />

      <div className="App">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/continents" element={<Continents />} />
          <Route path="/countries" element={<Countries />} />
          <Route path="/cities" element={<Cities />} />
          <Route path="/towns" element={<Towns />} />
          
        </Routes>
      </div>
    </div>
  );
}

export default App
