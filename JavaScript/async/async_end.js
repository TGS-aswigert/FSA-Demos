async function f() {

  let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("done!"), 3000)
  });

  let result = await promise; // wait until the promise resolves (*)

  console.log(result); // "done!"
  return result;
}

f();

module.exports = f;