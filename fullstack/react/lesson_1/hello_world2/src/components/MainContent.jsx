import React, { Component } from 'react';

import "./MainContent.css";

class MainContent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isEdit: false,
            editBook: {
                isbn: "",
                name: "",
                description: ""
            },
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

    onSubmitHandle(event) {
        // 1. Prevent default behavior => prevent the 'form' from submitting
        event.preventDefault();

        // 2. Add new book details to 'this.state.books' (this.setState())
        //  - First, include a 'spread' / 'shallow copy' of the current 'this.state.books'
        this.setState({
            books: [
                ...this.state.books,
                {
                    name: event.target.frm_book_name.value
                }
            ]
        });

        // 3. Remove the book name, to allow adding new books (event....)
        event.target.frm_book_name.value = "";
    }

    onDeleteHandle() {
        // 'arguments' is a pre-defined array that contains ALL properties sent to this function (aka event handler)
        // arguments[0] = book.isbn

        // 1. Find the book with the provided ISBN and remove it from the 'this.state.books'
        this.setState({
            books: this.state.books.filter(book => book.isbn !== arguments[0])
        })
    }

    onEditHandle() {
        // 1. Find book by book isbn (I received it in 'arguments[0]')
        const book = this.state.books.find(book => book.isbn === arguments[0]);

        // 2. Update the 'editBook' property in 'this.state' to contain the extracted details for editing
        this.setState({
            isEdit: true,
            editBook: {
                isbn: book.isbn,
                name: book.name,
                description: book.description
            }
        });
    }

    onUpdateHandle(event) {
        event.preventDefault();
    
        this.setState({
            isEdit: false,
            books: this.state.books.map(book => {
                // If the isbn of the book in the current iteration EQUALS the 'isbn' in the 'this.state.editBook'
                if (book.isbn === this.state.editBook.isbn) {
                    book.name = event.target.frm_book_name.value;
                    return book;
                }
        
                // Return the original book from the array (in the current iteration)
                return book;
            })
        });
    }

    render() { 
        return (
            <article className="holy-grail__middle">

                {/* EDIT NEW BOOK */}
                { this.state.isEdit === true &&
                    <div className="book_edit">
                        <form onSubmit={this.onUpdateHandle.bind(this)}>
                            <input type="text" name="frm_book_name" defaultValue={this.state.editBook.name}></input>
                            <button>Update</button>
                        </form>
                    </div>
                }

                {/* ADD NEW BOOK */}
                { !this.state.isEdit &&
                // { this.state.isEdit === false &&
                // { this.state.isEdit !== true &&
                    <div className="book_add">
                        <form onSubmit={this.onSubmitHandle.bind(this)}>
                            <input type="text" name="frm_book_name"></input>
                            <button>Add</button>
                        </form>
                    </div>
                }

                <div className="book_list">
                    { this.state.books.map(book => (
                            <div className="book_item">
                                <div>
                                    <span className="book_name">{book.name}</span>
                                    <span className="book_isbn">&nbsp;({book.isbn})</span>
                                    <span className="book_description">{book.description}</span>
                                </div>
                                <div className="book_actions">
                                    <button onClick={this.onDeleteHandle.bind(this, book.isbn)}>Delete</button>
                                    <button onClick={this.onEditHandle.bind(this, book.isbn)}>Edit</button>
                                </div>
                            </div>
                        )
                    ) /* this code creates a new ARRAY and hands it to REACT to display */}
                </div>
            </article>
        );
    }
}
 
export default MainContent;
