import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { filterPriorityChanged, statusFilterChanged, selectPriorityFilter, selectStatusFilter } from "./filtersSlice";

export default function Filters() {
	const priorityFilter = useSelector(selectPriorityFilter);
	const statusFilter = useSelector(selectStatusFilter);

	const dispatch = useDispatch();

	function handlePriorityFilterChange(e) {
		dispatch(filterPriorityChanged(e.target.value));
	}

	function handleStatusFilterChange(e) {
		dispatch(statusFilterChanged(e.target.value));
	}

	return (
		<div id='filters'>
			<h1>Filters:</h1>
			<div id='filter-panel'>
				<div>
					<h3>Filter by priority:</h3>
					<select
						name='priority-filter'
						id='priority-filter'
						value={priorityFilter}
						onChange={handlePriorityFilterChange}>
						<option value='all'>All</option>
						<option value='none'>None</option>
						<option value='high'>High</option>
						<option value='medium'>Medium</option>
						<option value='low'>Low</option>
					</select>
				</div>

				<div>
					<h3>Filter by status:</h3>
					<select name='status-filter' id='status-filter' value={statusFilter} onChange={handleStatusFilterChange}>
						<option value='all'>All</option>
						<option value='complete'>Complete</option>
						<option value='incomplete'>Incomplete</option>
					</select>
				</div>
			</div>
		</div>
	);
}
