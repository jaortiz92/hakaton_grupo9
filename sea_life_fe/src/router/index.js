import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../view/Home.vue'
import Adventure from '../view/AdventureView.vue'
import User from '../view/User.vue'

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
    path: '/User',
    name: 'User',
    component: User
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
