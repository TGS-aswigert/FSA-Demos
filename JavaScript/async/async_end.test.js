const { expect } = require('@jest/globals');
const f = require("./async.js");

test('the promise returns done!', () => {
  return f().then(result => {
    expect(result).toContain('done!');
  })
})