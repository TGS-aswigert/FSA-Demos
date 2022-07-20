import { BrowserRouter, Routes, Link, Route, Navigate } from 'react-router-dom';
import './App.css';
import CardList from './Components/CardList';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <nav>
        <Link to="/students">Students</Link>
        <Link to="/teams">Teams</Link>
      </nav>
        <Routes>
          <Route path='/' exact element={<Navigate to="/students" />} />
          <Route path='/:entity' element={<CardList />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
