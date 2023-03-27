import React from "react";
import { useDispatch } from "react-redux";
import { todoPriorityChanged, todoToggled } from "./todosSlice";

export default function TodoItem({ todo }) {
	const dispatch = useDispatch();

	function handleIsCompleteToggle() {
		dispatch(todoToggled(todo.id));
	}

	function handlePriorityChange(e) {
		dispatch(todoPriorityChanged(todo.id, e.target.value));
	}

	return (
		<div className='todo-item'>
			<h3>{todo.text}</h3>
			<div>
				<label htmlFor='priority'>Priority: </label>
				<select name='priority' id='priority' value={todo.priority} onChange={handlePriorityChange}>
					<option value='none'></option>
					<option value='high'>High</option>
					<option value='medium'>Medium</option>
					<option value='low'>Low</option>
				</select>
				<input
					type='checkbox'
					name='isComplete'
					id='isComplete'
					checked={todo.isComplete}
					onChange={handleIsCompleteToggle}
				/>
			</div>
		</div>
	);
}
