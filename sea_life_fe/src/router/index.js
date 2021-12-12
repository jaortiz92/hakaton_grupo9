import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../view/Home.vue'
import Adventure from '../view/AdventureView.vue'
import Login from '../view/Login.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/Adventure',
    name: 'Adventure',
    component: Adventure
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
