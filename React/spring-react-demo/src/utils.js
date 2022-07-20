export function getPagedData(page) {
  return fetch(`http://localhost:8080/api/students/${page}/5`)
  .then(response => response.json())
  .then(jsonResponse => jsonResponse);
}

export function getDataCount() {
  return fetch(`http://localhost:8080/api/students/count`)
  .then(response => response.json())
  .then(jsonResponse => jsonResponse);
}