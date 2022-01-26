import Counter from "./Counter";
import { shallow } from 'enzyme';

describe('Counter component text', () => {
  let wrapper;

  beforeEach(() => {
    wrapper = shallow(<Counter />);
    return wrapper;
  })

  it('starts with a count of 0', () => {
    const text = wrapper.find('h1').text();

    expect(text).toBe('0');

  });

  it('increments count by 1 when the increment button is clicked', () => {
    const incrementBtn = wrapper.find('button#increment');

    incrementBtn.simulate('click');
    const text = wrapper.find('h1').text();

    expect(text).toEqual('1');
  });

  test('decrements count by 1 when the decrement button is clicked', () => {
    const incrementBtn = wrapper.find('button#decrement');

    incrementBtn.simulate('click');
    const text = wrapper.find('h1').text();

    expect(text).toEqual('-1');
  });

});
