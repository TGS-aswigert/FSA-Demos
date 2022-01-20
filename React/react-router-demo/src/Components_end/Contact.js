import React, { Fragment } from "react";

export default function Contact() {
  return (
    <Fragment>
      <h3>Fill out this form to get in contact with us:</h3>
      <form>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Jane Doe" />
        <br />
        <br />

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Jane@Doe.io" />
        <br />
        <br />

        <label for="message">Message:</label>
        <textarea
          id="message"
          name="message"
          rows="20"
          cols="50"
          placeholder="Your message here."
        />
        <br />
        <br />

        <button type="submit">Submit</button>
      </form>
    </Fragment>
  );
}
