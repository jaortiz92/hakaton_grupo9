import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../view/Home.vue'
import Adventure from '../view/AdventureView.vue'

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

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
