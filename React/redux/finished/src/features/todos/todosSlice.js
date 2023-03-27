import { createSlice, nanoid } from "@reduxjs/toolkit";
import Priority from "../../priority";
import Status from "../../status";

const initialState = [
	{ id: nanoid(), text: "Walk the dog", priority: Priority.NONE, isComplete: false },
	{ id: nanoid(), text: "Drop off dry cleaning", priority: Priority.NONE, isComplete: false },
];

const todoSlice = createSlice({
	name: "todos",
	initialState,
	reducers: {
		todoAdded(state, action) {
			const newTodo = {
				id: nanoid(),
				text: action.payload,
				priority: Priority.NONE,
				isComplete: false,
			};
			state.push(newTodo);
		},
		todoToggled(state, action) {
			const todo = state.find(todo => todo.id === action.payload);
			todo.isComplete = !todo.isComplete;
		},
		todoPriorityChanged: {
			reducer(state, action) {
				const { todoId, priority } = action.payload;
				const todo = state.find(todo => todo.id === todoId);
				todo.priority = priority;
			},
			prepare(todoId, priority) {
				return {
					payload: { todoId, priority },
				};
			},
		},
	},
});

export const { todoAdded, todoToggled, todoPriorityChanged } = todoSlice.actions;
export const selectAllTodos = state => state.todos;
export const selectFilteredTodos = state => {
	const showAllStatuses = state.filters.status === Status.ALL;
	const showAllPriorities = state.filters.priority === Priority.ALL;
	return state.todos.filter(todo => {
		const statusMatches =
			showAllStatuses ||
			(todo.isComplete === true && state.filters.status === Status.COMPLETE) ||
			(todo.isComplete === false && state.filters.status === Status.INCOMPLETE);
		const priorityMatches = showAllPriorities || todo.priority === state.filters.priority;
		return statusMatches && priorityMatches;
	});
};
export default todoSlice.reducer;
