# Generated by Django 3.2.7 on 2021-12-11 18:23

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('authApp', '0002_delete_account'),
    ]

    operations = [
        migrations.AddField(
            model_name='user',
            name='rol',
            field=models.IntegerField(default=0, verbose_name='Rol'),
        ),
    ]
