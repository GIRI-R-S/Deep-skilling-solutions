import React,{Component} from "react";
import Post from "./Post";

class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            posts:[],
        };
    }


    componentDidMount(){
        this.loadPosts();
    }

    componentDidCatch(error,info){
        alert('An error occurred while rendering posts.');
        console.error('Error:',error);
        console.error('Info',info);
    }

    loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((res) => {
        if (!res.ok) throw new Error('Failed to fetch posts');
        return res.json();
      })
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        console.error('Fetch Error:', error);
        throw error;
      });
  }
 
    render() {
     return (
       <div>
       <h2>All Blog Posts</h2>
         {this.state.posts.length === 0 ? (
         <p>Loading...</p>
      ) : (
     this.state.posts.map((post) => (
         <Post key={post.id} title={post.title} body={post.body} />
     ))
    )}
    </div>
        );
     }
                        

}
export default Posts;

