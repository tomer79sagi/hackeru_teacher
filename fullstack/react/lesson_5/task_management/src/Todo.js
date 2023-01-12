import React, { Component } from 'react';
import "./Todo.css";

class Todo extends Component {

  constructor(props) {
    super(props);

    this.state = {
      edit: false,
      id: null,
      mockData: [{
        id: '1',
        title: 'Buy Milk.',
        done: false,
        date: new Date()
      }, {
        id: '2',
        title: 'Meeting with Ali.',
        done: false,
        date: new Date()
      }, {
        id: '3',
        title: 'Tea break.',
        done: false,
        date: new Date()
      }, {
        id: '4',
        title: 'Go for a run.',
        done: false,
        date: new Date()
      }]
    }
  }

  onSubmitHandle(event) {
    event.preventDefault();

    this.setState({
      mockData: [...this.state.mockData, {
        id: Date.now(),
        title: event.target.item.value,
        done: false,
        date: new Date()
      }]
    });

    event.target.item.value = '';
  }

  onDeleteHandle() {
    let id = arguments[0];

    this.setState({
      mockData: this.state.mockData.filter(item => {
        if (item.id !== id) {
          return item;
        }
      })
    });
  }

  onEditHandle(event) {
    this.setState({
      edit: true,
      id: arguments[0],
      title: arguments[1]
    });
  }

  onUpdateHandle(event) {
    event.preventDefault();

    this.setState({
      mockData: this.state.mockData.map(item => {
        if (item.id === this.state.id) {
          item['title'] = event.target.updatedItem.value;
          return item;
        }

        return item;
      })
    });

    this.setState({
      edit: false
    });
  }

  onCompleteHandle() {
    let id = arguments[0];

    this.setState({
      mockData: this.state.mockData.map(item => {
        if (item.id === id) {
          item['done'] = true;
          return item;
        }

        return item;
      })
    });
  }

  render() {
    return (
      <div>

        { this.state.edit && 

          <form onSubmit={this.onUpdateHandle.bind(this)}>
            <input type="text" name="updatedItem" className="item" defaultValue={this.state.title} />
            <button className="update-add-item">Update</button>
          </form>
        }

        { !this.state.edit &&
              <div className="todo_add">
                <form onSubmit={this.onSubmitHandle.bind(this)}>
                  <input type="text" name="item" className="item" />
                  <button className="btn-add-item">Add</button>
                </form>
              </div>
        }
        <div className="todo_list">
          <ul>
            {this.state.mockData.map(item => (
              <li key={item.id}>
                <div className={item.done ? 'todo_item done' : 'todo_item hidden' }>
                  {item.title}
                </div>
                <div className="todo_actions">
                  <button onClick={this.onEditHandle.bind(this, item.id, item.title)}>Edit</button>
                  &nbsp;
                  <button onClick={this.onCompleteHandle.bind(this, item.id)}>Complete</button>
                  &nbsp;
                  <button onClick={this.onDeleteHandle.bind(this, item.id)}>Delete</button>
                  &nbsp;
                </div>
              </li>
            ))}
          </ul>
        </div>
      </div>
    );
  }
}

export default Todo;
