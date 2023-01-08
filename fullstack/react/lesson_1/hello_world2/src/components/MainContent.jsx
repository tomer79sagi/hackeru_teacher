import React, { Component } from 'react';

class MainContent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            books: [
                {
                    isbn: "123456789",
                    name: "Daddy went to work",
                    description: "A book about a person's journey to work."
                },
                {
                    isbn: "987654321",
                    name: "Who let the dogs out?",
                    description: "A story about 3 dogs that fled the cannel."
                }
            ]
        };
    }

    render() { 
        return (
            <article className="holy-grail__middle">
                { this.state.books.map(book => (
                        <div>
                            <div>ISBN: {book.isbn}</div>
                            <div>Name: {book.name}</div>
                            <div>Description: {book.description}</div>
                        </div>
                    )
                ) /* this code creates a new ARRAY and hands it to REACT to display */}
            </article>
        );
    }
}
 
export default MainContent;
