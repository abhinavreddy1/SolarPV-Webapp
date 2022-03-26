import Avatar from '@material-ui/core/Avatar';
import Button from '@material-ui/core/Button';

import TextField from '@material-ui/core/TextField';

import Grid from '@material-ui/core/Grid';
import LockOutlinedIcon from '@material-ui/icons/LockOutlined';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import Container from '@material-ui/core/Container';
import MenuItem from '@material-ui/core/MenuItem';
import InputLabel from '@material-ui/core/InputLabel';
import Select from '@material-ui/core/Select';

import FormControl from '@material-ui/core/FormControl';
import {useRef,useState} from 'react';


const useStyles = makeStyles((theme) => ({
    paper: {
      marginTop: theme.spacing(2),
      display: 'flex',
      flexDirection: 'column',
      alignItems: 'center',
    },
    avatar: {
      margin: theme.spacing(1),
      backgroundColor: theme.palette.secondary.main,
    },
    form: {
      width: '100%', // Fix IE 11 issue.
      marginTop: theme.spacing(3),
    },
    submit: {
      margin: theme.spacing(3, 0, 2),
    },
  }));
  
  const useStyles1 = makeStyles((theme) => ({
    formControl: {
      margin: theme.spacing(0),
      // minWidth: 910,
  
    },
    selectEmpty: {
      marginTop: theme.spacing(2),
    },
  }));


return <>





        
        <form className={classes.form} noValidate onSubmit={formsubmithandler}>
          <Grid container spacing={2}>
           


         
            <Grid item xs={12} sm={4}>
              <TextField autoComplete=" id" name=" id" variant="outlined" required fullWidth id=" id" label=" ID" />
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="cert number" label="Cert Number" name=" cert number" autoComplete="cert number"/>
            </Grid> 


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="location" label="Location" name="location" autoComplete="location"/>
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="user id" label="User ID" name="user id" autoComplete="user id"/>
            </Grid>

            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="test standard" label="Test Standard" name="test standard" autoComplete="test standard"/>
            </Grid>

            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="certification" label="Certification" name="certification" autoComplete="certification"/>
            </Grid>
         
          </Grid>


             <Button  type="submit" fullWidth variant="contained" color="primary" className={classes.submit}>Sign Up</Button>


</form>



</>




export default TestSequence;


