import React, { useState } from "react";
import { useDispatch } from "react-redux";
import { todoAdded } from "./todosSlice";

export default function AddTodo() {
	const [newTodo, setNewTodo] = useState("");

	const dispatch = useDispatch();

	function handleTyping(e) {
		setNewTodo(e.target.value);
	}

	function handleSubmit() {
		dispatch(todoAdded(newTodo));
		setNewTodo("");
	}

	function handleEnterKeyDown(e) {
		if (e.key === "Enter") {
			handleSubmit();
			e.preventDefault();
		}
	}

	return (
		<div>
			<h1>Add New Todo:</h1>
			<form>
				<input
					type='text'
					name='new-todo'
					id='new-todo'
					value={newTodo}
					onChange={handleTyping}
					onKeyDown={handleEnterKeyDown}
				/>
				<button type='button' onClick={handleSubmit}>
					Add
				</button>
			</form>
		</div>
	);
}
