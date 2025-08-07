import './App.css';

function App() {
  const heading = "Office Space";

  const img = <img src="/OfficeImage.jpeg" height="25%" width="25%" alt="Office" />;

  const Office = {
    name: "DBS",
    rent: 70000,
    address: "Chennai"
  };

  const rentStyle = Office.rent <= 60000 ? { color: "red" } : { color: "green" };

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>{heading}, at Affordable Range</h1>
      {img}
      <h1>Name: {Office.name}</h1>
      <h2 style={rentStyle}>Rent: Rs. {Office.rent}</h2>
      <h3>Address: {Office.address}</h3>
    </div>
  );
}

export default App;
