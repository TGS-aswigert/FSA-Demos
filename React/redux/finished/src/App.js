import "./App.css";
import Filters from "./features/filters/Filters";
import AddTodo from "./features/todos/AddTodo";
import TodoList from "./features/todos/TodoList";

function App() {
	return (
		<div className='App'>
			<AddTodo />
			<TodoList />
			<Filters />
		</div>
	);
}

export default App;
