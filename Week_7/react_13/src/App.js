import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  return (
    <div className="main">
      <CourseDetails />
      <div className="separator" />
      <BookDetails />
      <div className="separator" />
      <BlogDetails /> 
    </div>
  );
}

export default App;
