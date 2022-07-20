export function getPagedData(entity, pageNum) {
  return fetch(`http://localhost:8080/api/${entity}/?page=${pageNum}&limit=5`, {
    method: "GET"
  })
  .then(response => response.json())
  .then(jsonResponse => jsonResponse);
}

export function getDataCount(entity) {
  return fetch(`http://localhost:8080/api/${entity}/count`)
  .then(response => response.json())
  .then(jsonResponse => jsonResponse);
}