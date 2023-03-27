import React from "react";
import { useSelector } from "react-redux";
import TodoItem from "./TodoItem";
import { selectFilteredTodos } from "./todosSlice";

export default function TodoList() {
	const todos = useSelector(selectFilteredTodos);

	const renderedTodos = todos.map(todo => <TodoItem key={todo.id} todo={todo} />);

	return (
		<div id='todo-list'>
			<h1>Todos:</h1>
			{renderedTodos}
		</div>
	);
}
