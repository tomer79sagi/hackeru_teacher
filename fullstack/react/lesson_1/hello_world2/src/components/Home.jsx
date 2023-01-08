import { Component } from 'react';
import './Home.css';

class Home extends Component {

    myStyles = {
        backgroundColor: "green"
    }

    constructor(props) {
        this.state = { 
            full_name: "Tomer Sagi",
            phone_number: "0528684411",
            email: "me@tomersagi.com"
        }   
    }

    getName() {
        // this.state.full_name = "John"; // FORBIDDEN

        setTimeout(() => {
            this.setState({
                full_name: "John Smith"
            });
        }, 3000);

        return "Tomer";
    }
    
    render() { 
        return (
            <div>
                <div style={ this.myStyles }>{ this.state.full_name }</div>
                <div style={ {backgroundColor: "orange"} }>{ this.getName() }</div>
            </div>
        );
    }
}
 
export default Home;