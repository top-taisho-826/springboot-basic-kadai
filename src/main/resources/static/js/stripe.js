const stripe = Stripe('pk_test_51RfEBMFKdoZM0kIf2bLRGeMALFB7spnFZzj9Lh4ftRShTEzLVGz6pdbzYpStI8Bh5OzfRWMCMQM9uegepjVdqzhV00ZWjVRO4S');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
 stripe.redirectToCheckout({
   sessionId: sessionId
 })
});