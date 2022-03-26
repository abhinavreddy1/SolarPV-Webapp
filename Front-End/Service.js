
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
import AccessibilityIcon from '@material-ui/icons/Accessibility';


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




function  Service () {

    const classes = useStyles();
const classes1 = useStyles1();

    const [age, setAge] = useState('');
    const [usstate, setusstate] = useState('');


    const [uservalid, setuservalid] = useState(false);
    const [passwordvalid, setpasswordvalid] = useState(false);



    const handleChange = (event) => {
      setAge(event.target.value);
    };
    const handleChangestate = (event) => {
      setusstate(event.target.value);
    };


 const usernameref = useRef();
 const paswordref = useRef();




    const formsubmithandler = event => {
      event.preventDefault();
    
if(usernameref.current.value.trim() ==="")
{
  setuservalid(true);
}
else{
  setuservalid(false);
}


if(paswordref.current.value.trim() ==="")
{
  setpasswordvalid(true);
}
else{
  setpasswordvalid(false);
}
   
      console.log("submit success");
};



const handleuserChange = (event) => {
  
  console.log(event.target.value)

  if(event.target.value === '')
  {
    setuservalid(true);
  }
  else{
    setuservalid(false);
  }
 
};


const handlepasswordChange = (event) => {
  
  console.log(event.target.value)

  if(event.target.value === '')
  {
    setpasswordvalid(true);
  }
  else{
    setpasswordvalid(false);
  }
 
};



return <>


<Container component="main" maxWidth="md">
  
      <div className={classes.paper}>
        <Avatar className={classes.avatar}>
          < AccessibilityIcon/>
        </Avatar>
        <Typography component="h1" variant="h5">
          Service
        </Typography>
        


        
        <form className={classes.form} noValidate onSubmit={formsubmithandler}>
          <Grid container spacing={2}>
           

      

            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id=" service  name" label="Service Name" name=" service Name" autoComplete="service name"/>
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="description" label="Description" name="description" autoComplete="description"/>
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="is fi requried" label="is FI requried" name="is fi requried" autoComplete="is fi requried"/>
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="FI frequency" label="FI frequency" name="FI frequency" autoComplete="FI frequency"/>
            </Grid>


            <Grid item xs={12} sm={4}>
              <TextField variant="outlined" required fullWidth id="standard ID" label="Standard ID" name="standard ID" autoComplete="standard ID"/>
            </Grid>


      
            
          </Grid>


          <Button  type="submit" fullWidth variant="contained" color="primary" className={classes.submit}>Submit</Button>
    
    
        </form>
      </div>
     
    </Container>


</>


}

export default Service;