import { createSlice } from "@reduxjs/toolkit";
import Priority from "../../priority";
import Status from "../../status";

const initialState = {
	status: Status.ALL,
	priority: Priority.ALL,
};

const filtersSlice = createSlice({
	name: "filters",
	initialState,
	reducers: {
		statusFilterChanged(state, action) {
			state.status = action.payload;
		},
		filterPriorityChanged(state, action) {
			state.priority = action.payload;
		},
	},
});

export const { statusFilterChanged, filterPriorityChanged } = filtersSlice.actions;
export const selectStatusFilter = state => state.filters.status;
export const selectPriorityFilter = state => state.filters.priority;

export default filtersSlice.reducer;
