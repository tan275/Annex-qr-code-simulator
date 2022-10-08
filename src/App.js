import React,{useState} from 'react'

const App = () => {
 //create a todo list
  const [todoList, setTodoList] = useState([])
  //create a todo
  const [todo, setTodo] = useState('')
  //create a function to add a todo
  const addTodo = () => {
    setTodoList([...todoList, todo])
    setTodo('')
  }
  //create a function to delete a todo
  const deleteTodo = (index) => {
    const newTodoList = [...todoList]
    newTodoList.splice(index, 1)
    setTodoList(newTodoList)
  }
  return (
    <div>
      <h1>Todo List</h1>
      <input type="text" value={todo} onChange={(e) => setTodo(e.target.value)} />
      <button onClick={addTodo}>Add Todo</button>
      <ul>
        {todoList.map((todo, index) => (
          <li key={index}>
            {todo}
            <button onClick={() => deleteTodo(index)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  )
}


export default App;